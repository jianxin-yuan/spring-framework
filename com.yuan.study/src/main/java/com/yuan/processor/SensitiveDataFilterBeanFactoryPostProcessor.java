package com.yuan.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.Set;

/**
 * @author yuan
 * @date 2019/11/29 3:48 下午
 * <p>
 * 将容器中敏感数据进行过滤处理
 */
public class SensitiveDataFilterBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	// 保存需要过滤的数据
	private Set<String> sensitives;

	public void setSensitives(Set<String> sensitives) {
		this.sensitives = sensitives;
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);

			// 对数据的处理
			StringValueResolver stringValueResolver = strVal -> {
				if (isSensitivesValue(strVal)) {
					return "*********";
				}
				return strVal;
			};
			BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(stringValueResolver);
			visitor.visitBeanDefinition(beanDefinition);
		}


	}

	// 判断是否需要过滤
	private boolean isSensitivesValue(String strVal) {
		return sensitives.contains(strVal);
	}

}

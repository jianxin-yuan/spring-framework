### 国际化使用方法
 * 新增properties文件,命名有规则,如中文zh_CN.配置文件就是xxx_zh_CN.properties
 * 注册国际化类.如`ResourceBundleMessageSource`,`ReloadableResourceBundleMessageSource`等
    bean的ID必须为messageSource,因为在`org.springframework.context.support.AbstractApplicationContext.MESSAGE_SOURCE_BEAN_NAME`类中已经写死了
 * 使用`context.getMessage`获取
 ```
	    Object[] params = new Object[0];
		String msg1 = context.getMessage("test", params, Locale.US);
		String msg2 = context.getMessage("test", params, Locale.CHINA);
```
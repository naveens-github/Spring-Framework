* Spring XML based Configuration.      
    * we use resources .xml file for bean configuration.
      * Example(main()): ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
* Spring Annotation based Configuration. 
    * we use resources .xml file for bean configuration.
      * Example(main()): ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotationBasedConfig.xml");
* Spring Java based Configuration.  
    * we use .java file for bean configuration. I.e, BeanConfig.Java class
      * Example(main()): ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);


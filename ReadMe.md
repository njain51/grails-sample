
Grails: 

- its a programming framework for rapidly building interactive web applications. 
- based on MVC architecture,
- MVC seperates your applciation logic into 3 distinct layers
  1: Model - data layer 
  2: View - Presentation layer, eg., browser
  3: Controller: Calculation done in this layer. Business logic stored here. 
  
  User make request to Browser => Request is received by web server =>  Dispather servlet runs of web server => sends requests to controler ==> it is here where most of time of requsest is spent =>  controller if needs data from database it makes a requst to model which talk to Db and returns data to controler
  
  Controller also constructs resulting web page by using template called View. Once it has page fully constructed then it sends back to web server via Dispather servlet to Browser to render ordinary web page. 
  
  
Grails Architecture: 
- its open source and maintained by pivotal. 
- Framework for building web applciation on Java Platform. 
- its full stack MVC framework so all 3 components are pre interated into this framework. 
- any harware running JVM can run grails applciation. 
- Spring Framework access core controller of Grails
- Hibernate framework for building data model and commmunicating with database 
- Sitemesh is templating framework used by views.
- Grails itself is scripting language that ties all these pieces together and is based on popular language called Groovy.

 
Installation: 
notes/setup_grails_project.pdf




  
  
  
  
  
  



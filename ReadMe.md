
Grails: 

- its a programming framework for rapidly building interactive web applications. 
- Its built on top of Spring Boot  and its Groovy based framework 
- based on MVC architecture,
- MVC seperates your applciation logic into 3 distinct layers
  1: Model - data layer 
  2: View - Presentation layer, eg., browser
  3: Controller: For Logic , for controlling , performing calculations and rules. . 
  
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

----------------------------------------------------------------------------------------------------------------
grails-app/controllers/myra/InventoryController.groovy

**Tag 1.0** - Added First controller, intro doc, grails commands and dir structure etc. 

----------------------------------------------------------------------------------------------------------------
notes/1.5_adding_view.md

**Tag 1.1** - Adding First View
----------------------------------------------------------------------------------------------------------------
notes/1.6_adding_model.md

**Tag 1.2** - Adding data to model and presenting in view.
----------------------------------------------------------------------------------------------------------------
notes/2.0_Designing_data_layer.md

Tag 2.0 - Adding Domain Design and respective domain classes and field types. Also established relationship between various domain classes. 
        - added hasMany or belongsto relationship between domain classes as per diagram. 
        
**Access database here:** http://localhost:8080/h2-console/
---------------------------------------------------------------------------------------------------------------- 
  
---------------------------------------------------------------------------------------------------------------- 
  
  
  



# SpringDI
In Majority of the files i added the comments to undestand the flow. 

Controller -> Service -> Repository.

From Above line Repository is not dependent on any layer, but usually we can add DataSource, but in this project i am not doing that.
Service layer is dependent on Repository Object, means Service layer uses Reposirory reference in its class.
Controller layer is dependent on Service layer object, so controller uses service reference in its class.

Added Initial version of DI. Created layered Architecture, then created objects via new key word which takes lot of effort to manage the objects,
In App2.Java initialized spring container via Xml , where we mention to spring container(Application Context) create these objects for me. 
Created Spring Beans via xml and used them to achieve loose coupling between 3 Layers.

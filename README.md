#UNITED WOR


The idea is to have a common "Instance" which ICE, SBOLStack and other repositories can extend. This repository has a proof of concept for the same. 

SBOL Stack comes with a Java API. We created a new Java API for the ICE RESTful endpoint which can be found here: 
https://github.com/CIDARLAB/ICERestAPIJava

The API is not complete and could become a fullfledged project. But it might be a good way to convert ICE data to an object which can be converted to SBOL with minimal loss in information. 

The main functions are in the United.java class which can be found in the org.cidarlab.unitedwor package. 


If you have a linux or Mac operating system, you can use the installdependencies.sh file in the lib folder to install some of the local dependencies. Else you'll have to manually install the dependencies. If there are any doubts, please contact prash@bu.edu


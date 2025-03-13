# Coffee Machine - Facade

This software simulates the operation of a coffee machine, its parts, and its interaction with two other objects, which in turn simulate two human beings.  
  
The class MacchinaFacade is acting as the Facade of its subsystem; it offers to the classes HumanClient and HumanMaintenance an interface of simplified methods, hiding its subsystem (for example, CoffeePourer and CoffeeGrinder) from them. The object UsualDay has the main inside of it, and will instanciate the other classes in order to make them interact.  

The class HumanClient has two attributes: `private Espresso cofi` and `private String name`. This class needs to be given a name on construction: a string parameter which will assign it to the name attribute. HumanClient can interact with MacchinaFacade class; its method `public void getCofi(MacchinaFacade mach);` will use the MacchinaFacade's interface in order to obtain an instance of Espresso, and will handle an Exception e, which can be thrown by the method `public Espresso autoModeIsGo();` in case the conditions to return an instance of Espresso are not met. The class HumanClient has also a getter method which returns the name attribute in form of a string.  
  
The class MacchinaFacade has four private attributes: `private CoffeeGrinder coffGrind` and `private CoffeePourer coffPour` will be instances of the subsystem of the machine. They are instanciated at construction. The attribute `private List<Grains> machineGrains` contains a List of objects of the class Grains.  
  
The class HumanMaintenance interacts with MacchinaFacade -> through the HumanMaintenance method `public void doMaintenance()`, which, through the grains obtained with the method `private void getGrainsFromCompany()`, is able to call the method `void maintenance(Grains grains)` of the class MacchinaFacade. This method will call the maintenance methods of the CoffeeGrinder and the CoffeePourer instances that the MacchinaFacade has, then it will add the grains passed by the HumanMaintenance to the machineGrains List of Grains.
  
The class MacchinaFacade implements the design pattern Singleton. Its constructor is private, and it holds the static attribute of its only instance, which can be accessed through the static method `public static MacchinaFacade getInstance()`, which returns the only instance of MacchinaFacade, or creates it if it has not yet been instanciated.   
    
// idea : create the `public Espresso experiencedMode(Grains grains)` method which will allow the user to set the temperature of the pourer, the grinding speed of the grinder, and to use "their own, personalized" coffee grains.  

  
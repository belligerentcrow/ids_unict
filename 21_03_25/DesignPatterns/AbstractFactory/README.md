# Theme Selector -- Abstract Factory implementation

The class set consists in a small mock chooser of themes: 
Each theme (Dark, Light) has its way of "portraying" the class Icon, Text, and Header.  

The AbstractFactory interface is implemented by both the DarkThemeCreator and the LightThemeCreator; the latter classes each implement the AbstractFactory, returning the correct kind of objects, which follow their own themes.  
  
Icon, Header, and Text are too interfaces, and are each implemented as many times as there are themes: in this case, each interface has 2 implementations (Dark, Light), which implement the original interface's methods in such a way to follow their own theme (Dark, Light).  
  
The Client can thus create an AbstractFactory object implemented in the theme of choosing, and Icon, Header, and Text objects which will be returned by the ConcreteFactory([Dark/Light]ThemeCreator) which the Client has chosen.  
  
The Client implements a static method which takes as input an Icon, a Header and a Text and "tries it out", calling the relevant method that each object has. The object will "respond" following the theme that the object will have been created by, through either the Dark or the Light 'Concrete Factories'.  
  
The class set is very easily scalable.  
  
In order to create a new theme, a developer would need first to create a new implementation of AbstractFactory, with a name which would reflect the theme of choice, for example, "SepiaThemeCreator". Then, the developer would need to create one "Sepia" implementation for each "Product" interface: Icon, Text, Header. Thus they will need to create a SepiaIcon class, a SepiaText class, and a SepiaHeader class; which will have to be returned through the SepiaThemeCreator methods.  

In order to create a new object, for example an Image, a developer would need to create the declaration of its getter in the AbstractFactory interface. Then they would need to create the version of the new object for each theme: DarkImage, LightImage, and so on; and create the relevant implementations which will allow the object to be returned to the client through each ThemeCreator.  
  

  


class car:

    def __init__(self, manufacturer, model,make,transmission, color ):
        self.manufacturer = manufacturer
        self.model=model
        self.make = make
        self.transmission= transmission
        self.color=color
    def accelerate(self):
        print(self.manufacturer +" " + self.model + " is moving")
    def stop(self):
        print(self.manufacturer + " " + self.model + " stopped moving")

car1 = car("Maruti","900","2019","Automated","Red")
car2 = car("venue","1200","2018","Manual","blue")
car3 = car("Ford","200","2008","Automated","Gray")
car2.accelerate()
car2.stop()
   
        
   
    
    
  
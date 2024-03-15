package com.example;

class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  Bicycle(int startCadence, int startSpeed, int startGear) {
    cadence = startCadence;
    speed = startSpeed;
    gear = startGear;
  }

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  void printStates() {
    System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
  }
}

class MountainBike extends Bicycle {
  int suspension;

  MountainBike(int startCadence, int startSpeed, int startGear, int startSuspension) {
    super(startCadence, startSpeed, startGear);
    suspension = startSuspension;
  }

  void adjustSuspension(int newValue) {
    suspension = newValue;
  }
}


/**package com.example;

  class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }
void changeGear(int newValue) {
  gear = newValue;
  }
void speedUp(int increment) {
  speed = speed + increment;
}
void applyBrakes(int decrement) {
  speed = speed - decrement;
}
 void printStates() {
  System.out.println(
    "cadence: " + cadence +
    "speed: " + speed +
    "gear: " + gear
  ); 
 }
}
  
  class MountainBike extends Bicycle {
    int suspension;

    MountainBike(int startHeight, int startSpeed, int startGear, int startSuspension){
        super(startHeight, startSpeed, startGear);
        suspension = startSuspension;
    }

    void adjustSuspension(int newValue) {
        suspension = newValue;
    }
}

*/
package koochaiyaphum.nitisak.lab4;

ToyotaAuto extends Automobile implements Moveable, Refuelable {
		public ToyotaAuto(int maximumspeed, int acceleration, String model) {

			this.setAcceleration(acceleration);
			this.setMaxSpeed(maximumspeed);
			this.setModel(model);
			this.setGasoline(100);
		}

		public void refuel() {
			this.setGasoline(100);
			System.out.println("refuels ");

		}

		public void accelerate() {

			if (this.getAcceleration() + this.getMaxSpeed() >= 160) {
				this.setGasoline(100);

			} else {
				this.setGasoline(100 - 15);

			}
		}

		public void brake() {
			
			if(this.getAcceleration()-this.getSpeed() == 0) {
				this.setSpeed(0);
				System.out.println("brakes�");
				
			}
			else {
				this.setSpeed(this.getSpeed()-this.getAcceleration());	
			}
	        
		
	    public static int setSpeed n  (int newspeed ) {
	      if(this.getSpeed()<=0||this.getSpeed()>getMaxSpeed()) {
	    	  this.setSpeed(0);
	      }
	    }
	    	
	    
	
}

package com.qa.calculator;

public class Results {

	private int Biology ;
	private int Chemistry ;
	private int Physics;
	private int Total;
//	public double percentage = (((float)Biology+(float)Chemistry+(float)Physics)/450)*100;
	private int percentage; //these class levels get evaluated first even if its below the methods
	private int BiologyP; //biology percentage
	private int ChemistryP;
	private int PhysicsP ;
	
	public Results(int Physics, int Chemistry, int Biology) {
		this.Chemistry = Chemistry;
		this.Physics = Physics;
		this.Biology = Biology;
		this.Total = Biology + Chemistry + Physics;
		this.BiologyP = (Biology * 100) / 150;
		this.ChemistryP = (Chemistry * 100) / 150;
		this.PhysicsP = (Physics * 100) / 150;
		this.percentage = (this.Total*100)/450;
	}
	//order of methods doesn't matter
	
	public void results(){
		System.out.println("Your results");
		System.out.println("Physics marks: " + this.Physics);
		System.out.println("Chemistry marks: " + this.Chemistry);
		System.out.println("Biology marks: " + this.Biology);
		System.out.println("Total marks: " + this.Total);
	}
		
//	public void percentages (double Physics, double Chemistry, double Biology) {
//		System.out.println("your percentage grade: " + ((Physics+Chemistry+Biology)/450)*100);
//	}
//	
	public void percentages() {
		if (this.percentage>=60 && this.BiologyP>=60 && this.PhysicsP >= 60 && this.ChemistryP >= 60) {
			System.out.println("you passed with percentage grade: " + this.percentage + "%");
			} else if(this.percentage>=60 && this.BiologyP>=60 && this.PhysicsP < 60 && this.ChemistryP < 60)
				{System.out.println("You passed but failed Chemistry & Physics " + this.percentage + "%");
					} else if(this.percentage>=60 && this.BiologyP < 60 && this.PhysicsP >= 60 && this.ChemistryP < 60) 
						{System.out.println("You passed but failed Biology & Chemistry " + this.percentage + "%");
							}else if(this.percentage>=60 && this.BiologyP < 60 && this.PhysicsP < 60 && this.ChemistryP >= 60) 
								{System.out.println("You passed but failed Biology & Physics " + this.percentage + "%");
								} else if(this.percentage>=60 && this.BiologyP<60 && this.PhysicsP >= 60 && this.ChemistryP >= 60) 
									{System.out.println("You passed but failed Biology " + this.percentage + "%");
										} else if(this.percentage>=60 && this.BiologyP>=60 && this.PhysicsP < 60 && this.ChemistryP >= 60) 
											{System.out.println("You passed but failed Physics " + this.percentage + "%");
												} else if(this.percentage>=60 && this.BiologyP>=60 && this.PhysicsP >=60 && this.ChemistryP < 60) 
													{System.out.println("You passed but failed Chemistry " + this.percentage + "%");
														} else 
															{System.out.println("you Failed: " + this.percentage + "%");//you can also fail two subjects too
															}
			}
}
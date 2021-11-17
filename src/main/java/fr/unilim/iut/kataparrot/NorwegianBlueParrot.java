package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	private static final double MAXIMUM_SPEED = 24.0;
	protected boolean isNailed;
	protected double voltage;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		this.isNailed = isNailed;
		this.voltage = voltage;
	}
	
	@Override
	public double getSpeed() {
		if (isNailed)
			return MINIMUM_SPEED;
		else
			return getBaseSpeed();
	}
	
	protected double getBaseSpeed() {
		return Math.min(MAXIMUM_SPEED, this.voltage * BASE_SPEED);
	}

}

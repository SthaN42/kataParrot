package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

	protected int numberOfCoconuts = 0;

	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, 0, false);
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}
}

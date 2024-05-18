
public class TwoWheelerParkingLot implements ParkingLot {
	private static final double RATE_PER_HOUR = 2000.0;

	@Override
	public double calculateParkingFee(int hours) {
		double fee = RATE_PER_HOUR * hours;
		if (hours > 24) {
			fee += (hours - 24) * RATE_PER_HOUR * 0.5;
		}
		return fee;
	}
}
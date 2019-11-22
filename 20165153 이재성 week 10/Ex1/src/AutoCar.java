
public class AutoCar implements OperateCar {
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 "+speed+"km/h로 바꿉니다.");
	}		
}


public class VideoPlayerTest {
	public static void main(String[] args) {
		controllable c = new controllable() {
			public void play() {
				System.out.println("VideoPlayer play()");
			}
			public void stop() {
				System.out.println("VideoPlayer stop()");
			}
		};
		c.play();
		c.stop();
	}
}

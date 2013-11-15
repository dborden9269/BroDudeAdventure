package dudebroadventures;

public class DudeBro {

	private int centerX;
	private int centerY;
	
	private int speedX = 0;
	private int speedY = 1;

	public void update() {

		if (speedX < 0) {
			centerX += speedX;
		} else if (speedX == 0) {
			System.out.println("Do not scroll the background.");

		} else {
			if (centerX <= 150) {
				centerX += speedX;
			} else {
				System.out.println("Scroll Background Here");
			}
		}
		

		if (centerY + speedY >= 382) {
			centerY = 382;
		}else{                       
                     centerY += speedY;
                }
		if (centerX + speedX <= 60) {
			centerX = 61;
		}
}
	public void moveRight() {
		speedX = 6;
	}

	public void moveLeft() {
		speedX = -6;
	}

	public void stop() {
		speedX = 0;
	}
}

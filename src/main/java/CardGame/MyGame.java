
package CardGame;

import java.awt.Color;

import plumb.PGame;

public class MyGame {



	public static void main(String[] args) {



		Deck deck = new Deck();
		Hand dealer = new Hand();
		Hand player = new Hand();

		Color colorButtonText = new Color(92, 157, 171);
		Color colorStatusText = new Color(253, 255, 153);
		Color colorBackground = new Color(94, 112, 153);
		Color colorBannerText = new Color(26, 16, 70);
		Color colorButton = new Color(26, 16, 70);
		Color colorBannerBackground = new Color(164, 39, 133);


		PGame.setButtonColor(colorButton);
		PGame.setButtonTextColor(colorButtonText);
		PGame.setStatusTextColor(colorStatusText);
		PGame.setFont("Times New Roman");
		PGame.setBackgroundColor(colorBackground);
		PGame.setBannerColor(colorBannerBackground);
		PGame.setBannerTextColor(colorBannerText);

		PGame.run(deck, dealer, player);

	}

}

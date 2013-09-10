package framework;

import framework.Graphics.PixmapFormat;

public class MySuperAwesomeStartScreen extends Screen {
	
    Pixmap awesomePic;
    float x;
    
    public MySuperAwesomeStartScreen(Game game) {
        super(game);
        awesomePic = game.getGraphics().newPixmap("data/pic.png",
                PixmapFormat.RGB565);
    }
    
    @Override
    public void update(float deltaTime) {
        x += 50 * deltaTime;
        if(x > 100)
            x = 0;
    }
    
    @Override
    public void present(float deltaTime) {
        game.getGraphics().clear(0);
        game.getGraphics().drawPixmap(awesomePic, x, 0, 0, 0,
                awesomePic.getWidth(), awesomePic.getHeight());
    }
    
    @Override
    public void pause() {
        // тут не надо ничего делать
    }
    
    @Override
    public void resume() {
        // тут тоже ничего не надо делать
    }
    
    @Override
    public void dispose() {
        awesomePic.dispose();
    }
    
}

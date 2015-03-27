package fuldrer.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import sun.java2d.SurfaceDataProxy;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture player[];
    Texture enemigo[];
    Texture bg;
    Texture perdi;
    int frame;
    int textura_actual;
    int hit;
    boolean gane;
    int hite;
    int textura_enemigo;
    boolean perder;
    Timer time;

    public static void temporizador(){
        for(int t =0; t<=60; t++){
            int tempo = 60;
        }
    }

	
	@Override
	public void create () {
		batch = new SpriteBatch();
        player = new Texture[3];
        enemigo = new Texture[2];
        bg = new Texture("gane.png");
        player[0] = new Texture("punch.png");
        player[1] = new Texture("punch1.png");
        player[2] = new Texture("punch2.png");
        enemigo[0] = new Texture("jefe.png");
        enemigo[1] = new Texture("jefe1.png");
        perdi = new Texture("perdi.png");
        frame = 0;
        hit =0;
        gane = false;
        perder = false;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        batch.draw(player[textura_actual], 0,150);
        batch.draw(enemigo[0],270, 120);
        if(perder){
            batch.draw(perdi, 0, 0);
        }
        if(gane){
            batch.draw(bg,0,0);
        }
		batch.end();

        if(Gdx.input.justTouched()) {
            hit +=2;
            System.out.println(hit);

            if(frame%10== 0) {
                textura_actual++;
                if (textura_actual > 2) {
                    textura_actual = 0;
                }
            }
        }
        if(hit == 100){
            gane = true;
	    }
        for(int c = 0; c<=60;c++){
            if(c == 60){
                perder = true;
            }
        }
    }
}


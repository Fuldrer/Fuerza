package fuldrer.mi.juego;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    Texture character_textures[];
    Texture bg;
    Texture enemigo;
    Texture game_over_texture;
    Texture enemigo2;


    int frame;
    int textura_actual;
    int bg_x;
    int enemigo_x;
    int enemigo2_x;

    boolean game_over;

    double velocidad_y;
    double y;

    double VELOCIDAD_INICIAL=20;
    double GRAVEDAD = -1;
    double PISO = 20;
    int VELOCIDAD = 5;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		character_textures = new Texture[3];
        character_textures[0] = new Texture("4.png");
        character_textures[1] = new Texture("5.png");
        character_textures[2] = new Texture("6.png");
        bg = new Texture("bg2.png");
        enemigo = new Texture("m1.png");
        enemigo2 = new Texture("enemigo.png");
        game_over_texture = new Texture("game_over.png");
        frame = 0;
        textura_actual = 0;
        bg_x = 0;
        enemigo_x = 640;
        game_over = false;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
        batch.draw(bg,bg_x,0);
        batch.draw(bg, bg_x+640, 0);
        batch.draw(enemigo2, enemigo2_x, 0);
        batch.draw(enemigo, enemigo_x, 0);
		batch.draw(character_textures[textura_actual], 0, (int)y);
        if(game_over)
            batch.draw(game_over_texture,0,0);
		batch.end();
        System.out.println(textura_actual);

        enemigo_x -= VELOCIDAD;
        enemigo2_x-=VELOCIDAD+10;
        if(enemigo2_x<=-900)
            enemigo2_x=740;

        if(enemigo_x<=-800)
            enemigo_x=640;

        if(enemigo_x<character_textures[textura_actual].getWidth()-5
                && enemigo_x-enemigo2.getWidth()>0
                && y<200)
        {
            game_over = true;
        }


        bg_x -= VELOCIDAD;
        if(bg_x<=-640)
            bg_x = 0;

        if(frame%20== 0) {
            textura_actual++;
            if (textura_actual > 2)
                textura_actual = 0;
        }
        if(Gdx.input.justTouched())
        {
            System.out.println(Gdx.input.getX());
            System.out.println(Gdx.input.getY());
            velocidad_y=VELOCIDAD_INICIAL;
        }

        velocidad_y+=GRAVEDAD;
        y+=velocidad_y;
        if(y<PISO)
            y=PISO;

        frame++;

	}
}

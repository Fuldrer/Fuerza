package fuldrer.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;

    public class Timer extends Actor {
        String seg = "", mil = "";
        int Seg=0,Mil=0;
        BitmapFont font;
        int opt;
        public Timer(BitmapFont font) {
            this.font=font;
        }
        @Override
        public void act(float delta) {
            super.act(delta);
            try {
                run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        private void run() throws InterruptedException{
            Thread.sleep(2);
            if(compare(getMil(), "<", 78)){
                Mil+=2;
            }else{
                ++Mil;
            }
            if(compare(getMil(), "=", 60)){
                ++Seg;
                Mil=0;
            }
        }
        public int getSeg(){
            return Seg;
        }
        public int getMil(){
            return Mil;
        }
        public boolean compare(int n1, String opt, int n2){
            if (opt.equals("=")) {
                return n1 == n2;
            } else if (opt.equals("!")) {
                return n1 != n2;
            } else if (opt.equals("<=")) {
                return n1 <= n2;
            } else if (opt.equals(">=")) {
                return n1 >= n2;
            } else if (opt.equals("<")) {
                return n1 < n2;
            } else if (opt.equals(">")) {
                return n1 > n2;
            } else {
                return false;
            }
        }
        @Override
        public void draw(Batch batch, float parentAlpha) {
            super.draw(batch, parentAlpha);
            font.drawMultiLine(batch, getSeg()+":"+getMil(), getX(), getY());
            font.setColor(Color.BLACK);
        }
    }


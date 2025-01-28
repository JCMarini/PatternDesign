package org.jcmc.test.decorator;

public class AutoElectrico extends AutoDecorate {

    private float speed = 0;
    private boolean isStarted = false;

    public AutoElectrico(Automovil automovil) {
        super(automovil);
    }

    @Override
    public void acelerar() {
        speed++;
    }

    @Override
    public void frenar() {
        if (speed == 0) {
            speed = 0;
            return;
        }
        speed--;
    }

    @Override
    public void encender() {
        isStarted = true;
    }

    @Override
    public void apagar() {
        isStarted = false;
    }

}

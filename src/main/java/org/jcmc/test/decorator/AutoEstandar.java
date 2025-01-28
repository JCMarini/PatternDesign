package org.jcmc.test.decorator;

public class AutoEstandar implements Automovil {

    private float speed = 0;
    private boolean isStarted = false;

    public float getVelocidad() {
        return speed;
    }

    public void setVelocidad(float velocidad) {
        this.speed = velocidad;
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

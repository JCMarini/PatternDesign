package org.jcmc.test.decorator;

public abstract class AutoDecorate implements Automovil {

    private Automovil automovil;
    private boolean enchufar = false;

    public AutoDecorate(Automovil automovil) {
        this.automovil = automovil;
    }

    protected Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public boolean isEnchufar() {
        return enchufar;
    }

    public void setEnchufar(boolean enchufar) {
        this.enchufar = enchufar;
    }
}

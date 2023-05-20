package TemplateMethod.logic;

public class Windows extends SistemaOperativo {
    @Override
    protected void cargarSistemaOperativo(String distro) {
        System.out.println("Iniciar firmware UEFI");
        System.out.println("Cargar núcleo Windows NT");
        System.out.println("Arranca Windows Boot Manager");
    }

    @Override
    protected void mostrarEscritorio(String escritorio) {
        System.out.println("Muestra escritorio Windows");
    }
}

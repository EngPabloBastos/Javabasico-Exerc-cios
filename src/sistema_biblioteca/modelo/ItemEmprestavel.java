package sistema_biblioteca.modelo;

public abstract class ItemEmprestavel extends ItemAcervo implements ItemAcervo{
    private Usuario usuarioAtual;

    protected ItemEmprestavel(String codigo, String titulo, int ano){
        super(codigo,titulo, ano);
        this.usuarioAtual = null;
    }
    @Override
    public boolean emprestar(Usuario usuario){
        if (usuario == null){
            throw new IllegalArgumentException("Usuario não pode ser nulo");
        }
        if (!isDisponivel()){
            System.out.println("Item indisponível!");
        }

        return true;
    }

}

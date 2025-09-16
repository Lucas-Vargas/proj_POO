public class Main {

    public static void main(String[] args) {
        //----Objetos----
        Cadastrar cad = new Cadastrar();
        Assets a = new Assets();
        //----------------

        //Cadastrar cliente
        cad.CadCliente();

        //Cadastrar Endereço
        cad.CadEndereco();

        //Cadastrar 1 ou mais pets
        System.out.println("Qual animal deseja cadastrar? 1 - Cachorro, 2 - Gato");
        int res = a.sc.nextInt(), err = 0;

        if(res == 1){
            cad.CadCachorro();
        }else if(res == 2){
            cad.CadGato();
        }else{
            System.out.println("Informe apenas 1 ou 2.");
            err = 1;
        }

        //Criar atendimento para PETs criados

        /*Adicionar serviços ao atendimento
        Consulta: Emergencia gera taxa extra
        Banho: Porte gera taxa extra
        Vacina: Valor fixo
        */




    }
}
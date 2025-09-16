public class Cadastrar {
    Assets a = new Assets();

    public Cachorro CadCachorro(){
        String[] dados = new String[2];
        int idade;
        System.out.println("Informe os seguintes dados: \nNome: ");
        dados[0] = a.sc.nextLine();
        System.out.println("Raça: ");
        dados[1] = a.sc.nextLine();
        System.out.println("Idade: ");
        idade = a.sc.nextInt();

        return new Cachorro(dados[0], dados[1], idade);
    }

    public Gato CadGato(){
        String[] dados = new String[2];
        int idade;
        System.out.println("Informe os seguintes dados: \nNome: ");
        dados[0] = a.sc.nextLine();
        System.out.println("Raça: ");
        dados[1] = a.sc.nextLine();
        System.out.println("Idade: ");
        idade = a.sc.nextInt();

        return new Gato(dados[0], dados[1], idade);
    }

    public Cliente CadCliente(){

        String[] dados = new String[2];
        System.out.println("Informe os seguintes dados: \nNome: ");
        dados[0] = a.sc.nextLine();
        System.out.println("Documento: ");
        dados[1] = a.sc.nextLine();

        return new Cliente(dados[0],dados[1]);
    }

    public Endereco CadEndereco(){

        String[] dados = new String[4];
        System.out.println("Informe os seguintes dados: \nRua: ");
        dados[0] = a.sc.nextLine();
        System.out.println("Cidade: ");
        dados[1] = a.sc.nextLine();
        System.out.println("UF: ");
        dados[2] = a.sc.nextLine();
        System.out.println("CEP: ");
        dados[3] = a.sc.nextLine();

        return new Endereco(dados[0],dados[1],dados[2],dados[3]);
    }


}

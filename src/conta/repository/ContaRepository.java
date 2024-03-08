package conta.repository;

import conta.model.Conta;

public interface ContaRepository {
	
	// CRUD da Conta
		public void procurarPorNumero(int number);
		public void listarTodas();
		public void cadastrar(Conta conta);
		public void atualizar(Conta conta);
		public void deletar(int number);
		
		// Métodos Bancários
		public void withdraw(int number, float value);
		public void deposit(int number, float value);
		public void transferir(int numeroOrigem, int numeroDestino, float value);
}

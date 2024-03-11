package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int number = 0;
	
	@Override
	public void procurarPorNumero(int number) {
		var conta = buscarNaCollection(number);
		
		if (conta != null)
			conta.view();
		else
			System.out.println("\nA Conta número: " + number + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta: listaContas) {
			conta.view();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: " + conta.getNumber() + "foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumber());
		
		if(buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta numero: " + conta.getNumber() + " foi atualizada com sucesso!");
		} else 
			System.out.println("\nA Conta numero: " + conta.getNumber() + " não foi encontrada!");
		
	}

	@Override
	public void deletar(int number) {
		var conta = buscarNaCollection(number);
		
		if(conta != null) {
			if(listaContas.remove(conta) == true)
				System.out.println("\nA Conta número: " + number + " foi deletada com sucesso!");
		} else
			System.out.println("\nA Conta numero: " + number + " não foi encontrada");
	}

	@Override
	public void withdraw(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int number, float value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float value) {
		// TODO Auto-generated method stub
		
	} 
	
	public int gerarNumero() {
		return ++ number;
	}
	
	public Conta buscarNaCollection(int number) {
		for(var conta: listaContas) {
			if(conta.getNumber() == number) {
				return conta;
			}
		} 
		return null;
	}
}

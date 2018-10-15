package org.jccastro.clip.assesment.transaction.datastore;

import java.util.List;

import org.jccastro.clip.assesment.model.Transaction;

/**
 * Interface for the basic transaction operations
 * @author JCCastro
 *
 */
public interface TransactionDataStore {

	public void saveTransaction(Transaction transaction);
	
	public Transaction getTransaction(String userId, String transactionId);

	public List<Transaction> getUserTransactions(String userId);

}

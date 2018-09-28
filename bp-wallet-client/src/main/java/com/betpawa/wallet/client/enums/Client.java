package com.betpawa.wallet.client.enums;

import com.betpawa.wallet.client.dto.WalletClientParams;
import com.betpawa.wallet.client.dto.ClientResponse.Builder;
import com.bp.wallet.proto.BalanceResponse;

public interface Client {

	int MEAN_FACTOR = 3;
	int DEFAULT_WAIT_TIME = 1;
	int AVERAGE_RPC_PER_ROUND = 7;

	static Long getOptimizedWaitingTime(final WalletClientParams clientParams) {
		Long defaultWaitTime = Long.valueOf(DEFAULT_WAIT_TIME);
		defaultWaitTime = Long.valueOf((clientParams.getNumberOfUsers() * clientParams.getNumberOfRequests()
				* clientParams.getNumberOfRounds() * AVERAGE_RPC_PER_ROUND) / MEAN_FACTOR);
		return defaultWaitTime;
	}

	static Long getTotalNumberOfRPCS(final WalletClientParams clientParams) {
		return getOptimizedWaitingTime(clientParams) * MEAN_FACTOR;
	}

	static void pingServer() {
		// For Health Check
	}

	static String buildGetBalanceLogLine(BalanceResponse balanceResponse) {
		StringBuilder stringBuilder = new StringBuilder();
		balanceResponse.getRemainingBalanceList().stream().forEach(balance -> {
			stringBuilder.append(balance.getAmount()).append(balance.getCurrency().name()).append(" ");
		});
		return stringBuilder.toString();
	}
}
package com.cts.poc.dif.handler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class DifHandler extends SpringBootRequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

	private static Log logger = LogFactory.getLog(DifHandler.class);

	@Override
	public Object handleRequest(APIGatewayProxyRequestEvent requestEvent, Context context) {
		logger.debug("Distributor handler invoked");
		return super.handleRequest(requestEvent, context);
	}
}
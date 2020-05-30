package com.java8.stream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.util.Pair;

import java.io.IOException;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayingWithStreams
{
	//First one is complete and second one is single string
	public static Function<Pair<String, String>, String>
			getUpdatedValue = Pair -> {
		String updatedValue = "";
		if (Pair.getKey().contains("'" + Pair.getValue() + "'"))
		{
			return updatedValue;
		}
		return Pair.getValue();
	};


	public static void main(String[] args) throws IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonValue = "{\n" +
				                   "  \"orgProp\": {\n" +
				                   "    \"id\": \"250\",\n" +
				                   "    \"Rules\": [\n" +
				                   "      {\n" +
				                   "        \"orgName\": \"'Rohan','Komal','Rinkesh'\"\n" +
				                   "      },\n" +
				                   "      {\n" +
				                   "      }\n" +
				                   "    ]\n" +
				                   "  }\n" +
				                   "}";
		final JsonNode jsonNode = objectMapper.readTree(jsonValue);
		final String orgNames = objectMapper.convertValue(jsonNode.findValue("orgName"), String.class);
		PlayingWithStreams playingWithStreams = new PlayingWithStreams();
		final String finalValue = playingWithStreams.readValues(orgNames);
		System.out.println("Value ::" + finalValue);
	}

	public String readValues(String orgNames)
	{
		String usersInput = "Rahul";
		return Stream.of(orgNames)
		             .map(element -> getUpdatedValue.apply(new Pair<>(orgNames, usersInput)))
		             .collect(Collectors.joining());
	}
}


package com.store.book.constants;

public class BookTestConstants {

	public static final String BOOK_INFO_TO_MATCH = "[{\"serialNumber\":\"1\",\"title\":\"Clean Code\",\"authorName\":\"Robert Martin\",\"yearOfPublish\":\"2008\",\"price\":\"50\"},{\"serialNumber\":\"2\",\"title\":\"The Clean Coder\",\"authorName\":\"Robert Martin\",\"yearOfPublish\":\"2011\",\"price\":\"50\"},{\"serialNumber\":\"3\",\"title\":\"Clean Architecture\",\"authorName\":\"Robert Martin\",\"yearOfPublish\":\"2017\",\"price\":\"50\"},{\"serialNumber\":\"4\",\"title\":\"Test Driven Development by Example\",\"authorName\":\"Kent Beck\",\"yearOfPublish\":\"2003\",\"price\":\"50\"},{\"serialNumber\":\"5\",\"title\":\"Working Effectively With Legacy Code\",\"authorName\":\"Michael C. Feathers\",\"yearOfPublish\":\"2004\",\"price\":\"50\"}]";

	public static final int PRICE_FOR_THE_BOOK = 50;

	public static final String SHOULD_MATCH_ENUM_VALUES = "Returned books should match enum values";

	public static final String SHOULD_RETURN_ALL_BOOKS = "Should return all available books";

	public static final String SHOULD_NOT_BE_EMPTY = "Book list should not be empty";

	public static final String GET_BOOK_API = "/store/books";

	public static final String PRICE_API = "/store/calculatePrice";

	public static final String BASKET_WITH_ONE_BOOK = "{\"selectedBooks\":[{ \"serialNumber\": \"1\",\"quantity\":1}]}";

	public static final String NO_BOOK_PRESENT_WITH_GIVEN_SERIAL_NUMBER = "{\"message\":\"There is no book present with Serial number: [55]\"}";

	public static final String UNDEFINED_SERIAL_NUMBER_OF_BOOK = "{\"selectedBooks\":[{ \"serialNumber\": \"55\",\"quantity\":1}]}";

	public static final int PRICE_FOR_TWO_BOOKS = 100;

	public static final String PRICE_AFTER_DISCOUNT_FOR_TWO_BOOKS = "95.00";

	public static final int OFFER_PERCENTAGE_FOR_TWO_BOOKS = 5;

	public static final String EMPTY_SHOPPING_BASKET_ERROR = "{\"message\":\"Shopping basket is empty. Please add books to proceed.\"}";

	public static final String EMPTY_BASKET_REQUEST = "{}";

	public static final String DUPLICATE_SERIAL_NUMBERS = "{\"selectedBooks\":[{ \"serialNumber\": \"4\",\"quantity\":1},{ \"serialNumber\": \"4\",\"quantity\":1}]}";

	public static final String DUPLICATE_QUERY_FOR_SAME_BOOK_ERROR = "{\"message\":\"Duplicate Serial number [4] found in the order! Please Remove or Update Quantity\"}";

	public static final int PRICE_FOR_THREE_BOOKS = 150;

	public static final String PRICE_AFTER_DISCOUNT_FOR_THREE_BOOKS = "135.0";

	public static final int OFFER_PERCENTAGE_FOR_THREE_BOOKS = 10;

	public static final int PRICE_FOR_FOUR_BOOKS = 200;

	public static final String PRICE_AFTER_DISCOUNT_FOR_FOUR_BOOKS = "160.0";

	public static final int OFFER_PERCENTAGE_FOR_FOUR_BOOKS = 20;

	public static final int PRICE_FOR_FIVE_BOOKS = 250;

	public static final String PRICE_AFTER_DISCOUNT_FOR_FIVE_BOOKS = "187.50";

	public static final int OFFER_PERCENTAGE_FOR_FIVE_BOOKS = 25;

	public static final String SELECTED_BOOK_WITH_OUT_SL_NO = "{\"selectedBooks\":[{ \"serialNumber\": \"\",\"quantity\":1}]}";

	public static final String SERIAL_NUMBER_MISSING_ERROR = "{\"message\":\"SerialNumber Missing in the request! Add Missing details and request again\"}";

	public static final String SELECTED_BOOK_WITH_ZERO_QUANTITY = "{\"selectedBooks\":[{ \"serialNumber\": \"1\",\"quantity\":0}]}";

	public static final String ORDER_QUANTITY_MISSING_ERROR = "{\"message\":\"Order quantity is Missing in the request! Add Missing details and request again\"}";
	
	public static final String PRICE_AFTER_DISCOUNT_FOR_TWO_ELIGIBLE_AND_ONE_NORMAL_BOOK = "145.00";

}

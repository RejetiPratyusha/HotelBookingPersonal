package com.test;
import org.junit.Assert;
import org.junit.Test;

import com.springboot.HotelBookingSystem.model.Feedback;
import com.springboot.HotelBookingSystem.service.FeedbackService;


public class FeedbackTest {
	

		
		FeedbackService feedbackService = new FeedbackService();

		@Test
		public void testAddFeedback() {
			Feedback feedback = new Feedback();
			feedback.setComments("Good");
			feedback.setRating(5);
			Assert.assertEquals(feedback,feedbackService.addFeedback(feedback));
		}

	/*
	 * @Test public void testGetFeebackForHotel() { fail("Not yet implemented"); }
	 */
	}




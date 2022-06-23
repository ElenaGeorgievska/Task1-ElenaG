package com.example.task.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.entity.Reviews;

@RestController
public class MainController {

	@GetMapping("/reviews")
	public List<Reviews> getReviews() {

		List<Reviews> review = new ArrayList<>();

		review.add(new Reviews(2097047, "93f131be27dc1122bb7ef0048ad10e4f", "5 star review", "5 star review", 0, 0, 0,
				5, "2 months ago", "2021-01-25T13:00:35+00:00", 1611579635, null, null, "Reviewer #20", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097046, "6e7bd4c71a56885ef583bd79186af689", "4 star review", "4 star review", 0, 0, 0,
				4, "2 months ago", "2021-01-25T13:00:21+00:00", 1611579621, null, null, "Reviewer #19", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097045, "ced8bd056d0adec93c651f935c7dde80", "3 star review", "3 star review", 0, 0, 0,
				3, "2 months ago", "2021-01-25T13:00:10+00:00", 1611579610, null, null, "Reviewer #18", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097044, "b0dfee9017fafe7d751f0fea1f3ce540", "2 star review", "2 star review", 0, 0, 0,
				2, "2 months ago", "2021-01-25T12:59:57+00:00", 1611579597, null, null, "Reviewer #17", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097043, "10588b914a39967f3a702b02f3751794", "1 star review", "1 star review", 0, 0, 0,
				1, "2 months ago", "2021-01-25T12:59:40+00:00", 1611579580, null, null, "Reviewer #16", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097042, "1d14901bbb67ded3368d2d8d8b5989d8", "5 star review", "5 star review", 0, 0, 0,
				5, "2 months ago", "2021-01-25T12:59:27+00:00", 1611579567, null, null, "Reviewer #15", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097041, "ca10718af15af32f71da09a6e5f78c48", "", "", 0, 0, 0, 4, "2 months ago",
				"2021-01-25T12:59:15+00:00", 1611579555, null, null, "Reviewer #14", null, "custom", false, "custom",
				"1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097040, "65b3ba7d67109d2a4f573fca44d5e532", "3 star review", "3 star review", 0, 0, 0,
				3, "2 months ago", "2021-01-25T12:58:46+00:00", 1611579526, null, null, "Reviewer #13", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097039, "c111f4f05a1048e3a43a28e5bfd0be27", "", "", 0, 0, 0, 2, "2 months ago",
				"2021-01-25T12:58:22+00:00", 1611579502, null, null, "Reviewer #12", null, "custom", false, "custom",
				"1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097038, "be88045286fcb7ca91e234b37eef511b", "1 star review", "1 star review", 0, 0, 0,
				1, "2 months ago", "2021-01-25T12:58:06+00:00", 1611579486, null, null, "Reviewer #11", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097037, "70b57c0433d0221b0788b106fb9fdd5a", "", "", 0, 0, 0, 5, "2 months ago",
				"2021-01-25T12:57:48+00:00", 1611579468, null, null, "Reviewer #10", null, "custom", false, "custom",
				"1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097036, "59cbd1e887e8cce76ef68318b198ddf0", "4 star review", "4 star review", 0, 0, 0,
				4, "2 months ago", "2021-01-25T12:57:35+00:00", 1611579455, null, null, "Reviewer #09", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097034, "ac50da2870193abe25ba529597cfbd23", "", "", 0, 0, 0, 3, "2 months ago",
				"2021-01-25T12:57:11+00:00", 1611579431, null, null, "Reviewer #08", null, "custom", false, "custom",
				"1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097032, "f0c8bdd06d6c4ec35de765657e118602", "2 star review", "2 star review", 0, 0, 0,
				2, "2 months ago", "2021-01-25T12:56:55+00:00", 1611579415, null, null, "Reviewer #07", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097031, "ef2ad7498e260ec9462d0f27801c86b3", "", "", 0, 0, 0, 1, "2 months ago",
				"2021-01-25T12:56:34+00:00", 1611579394, null, null, "Reviewer #06", null, "custom", false, "custom",
				"1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097030, "d55229232defac9397fc6f12550d4f1f", "5 star review", "5 star review", 0, 0, 0,
				5, "2 months ago", "2021-01-25T12:56:17+00:00", 1611579377, null, null, "Reviewer #05", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097029, "3a6dd5070788c36f28c4f78eb349c248", "4 star review", "4 star review", 0, 0, 0,
				4, "2 months ago", "2021-01-25T12:55:57+00:00", 1611579357, null, null, "Reviewer #04", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097028, "01223a92f8823251b9678720def5ff43", "3 star review", "3 star review", 0, 0, 0,
				3, "2 months ago", "2021-01-25T12:55:40+00:00", 1611579340, null, null, "Reviewer #03", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097027, "5b8c2de55dbb5ccf9f8d033c1859b559", "2 star review", "2 star review", 0, 0, 0,
				2, "2 months ago", "2021-01-25T12:55:21+00:00", 1611579321, null, null, "Reviewer #02", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));
		review.add(new Reviews(2097026, "691d4d278dc23aa9a478e078b9382c2a", "1 star review", "1 star review", 0, 0, 0,
				1, "2 months ago", "2021-01-25T12:55:06+00:00", 1611579306, null, null, "Reviewer #01", null, "custom",
				false, "custom", "1-20 Reviews", "890cdd7974cdf8aabe6e9051f5a87303bdb933ae", null, null));

		// filter rating >=3
		review.stream().filter(p -> p.getRating() >= 3).collect(Collectors.toList());

		// sort by rating
		Collections.sort(review, new Comparator<Reviews>() {
			@Override
			public int compare(Reviews lhs, Reviews rhs) {

				return rhs.getRating().compareTo(lhs.getRating());
			}
		});

		// sort by Date
		Collections.sort(review, new Comparator<Reviews>() {
			@Override
			public int compare(Reviews lhs, Reviews rhs) {

				return lhs.getReviewCreatedOnDate().compareTo(rhs.getReviewCreatedOnDate());

			}
		});

		// sort by review text
		Collections.sort(review, new Comparator<Reviews>() {
			@Override
			public int compare(Reviews lhs, Reviews rhs) {
				return rhs.getReviewText().compareTo(lhs.getReviewText());
			}
		});

		for (int i = 0; i < review.size(); i++) {

			System.out.println(review.get(i));
		}

		return review;

	}

}

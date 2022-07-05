package com.cydeo.step_definitions.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NetflixStepDef {
    @Given("I like {string}")
    public void i_like(String movieGenre) {
        System.out.println("Step Given I like"+movieGenre);
    }
    @When("I go to homepage")
    public void i_go_to_homepage() {
        System.out.println("Step When I go to homepage");
      }
    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {
        System.out.println("Step Then I should get recommendation");
    }
    @Given("I like")
    public void i_like(List<String> listOfMovieGenre) {
        System.out.println(listOfMovieGenre);
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }

    @Given("I like below favorite movie with certain type")
    public void i_like_below_favorite_movie_with_certain_type(Map<String,String>favMovieMap) {
        System.out.println("Favorite Movie Map->"+ favMovieMap);
        System.out.println(favMovieMap.get("actions"));
        System.out.println(favMovieMap.get("drama"));
        System.out.println(favMovieMap.get("cartoon"));
        System.out.println(favMovieMap.get("adventure"));
    }

    @Given("I like below movies with ratings")
    public void i_like_below_movies_with_ratings(List<List<String>>moviesList) {
        System.out.println(moviesList);
        System.out.println("First Row ->"+moviesList.get(0));
        System.out.println("Second Row ->"+moviesList.get(1));
        System.out.println("Third Row ->"+moviesList.get(2));
        System.out.println("Getting cells->"+moviesList.get(0).get(1));
    }

    @Given("I like below movie table with ratings")
    public void i_like_below_movie_table_with_ratings(List<Map<String, String>>listOfMaps) {
        System.out.println(listOfMaps);
    }
}

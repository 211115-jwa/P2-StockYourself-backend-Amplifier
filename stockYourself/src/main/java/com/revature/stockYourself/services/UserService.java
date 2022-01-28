package com.revature.stockYourself.services;

import java.util.List;

import com.revature.stockYourself.beans.Portfolio;
import com.revature.stockYourself.beans.Post;
import com.revature.stockYourself.beans.StockString;
import com.revature.stockYourself.beans.User;
import com.revature.stockYourself.exceptions.CouldNotFindAllPostsException;
import com.revature.stockYourself.exceptions.CreatorWasNullException;
import com.revature.stockYourself.exceptions.IncorrectCredentialsException;
import com.revature.stockYourself.exceptions.PortfolioEnteredWasNull;
import com.revature.stockYourself.exceptions.PostAndOrUserWasNull;
import com.revature.stockYourself.exceptions.PostDoesNotExistInDatabaseException;
import com.revature.stockYourself.exceptions.PostEnteredWasNullException;
import com.revature.stockYourself.exceptions.UserIsNotThePostCreatorException;
import com.revature.stockYourself.exceptions.UsernameAlreadyExistsException;


public interface UserService {
	public User register(User newUser) throws UsernameAlreadyExistsException;
	public User logIn(String username, String password) throws IncorrectCredentialsException;
	public User getUserById(int id);

	public Post createPost(Post newPost);
	public Post updatePost(Post existingPost) throws PostDoesNotExistInDatabaseException, PostEnteredWasNullException;
	public List<Post> getAllPosts() throws CouldNotFindAllPostsException;
	public List<Post> getAllPostsByCreator(User creator) throws CreatorWasNullException;
	public List<Post> getAllPostsByPortfolio(Portfolio portfolioPostedOn) throws PortfolioEnteredWasNull, CreatorWasNullException;
	public void deletePost(Post postToDelete, User loggedInUser) throws UserIsNotThePostCreatorException, PostAndOrUserWasNull;	
	
	public List<StockString> getPortfolioStocks(Portfolio port);
	public Portfolio addStockToPortfolio(Portfolio port,StockString stock);
	public Portfolio removeStockToPortfolio(Portfolio port,StockString stock);
//	
	
	
//	public Portfolio addStockToPortfolio(Portfolio ExistingPort,StockString stockString);
//	public Portfolio removeStockFromPortfolio(Portfolio ExistingPort,StockString remStockString);
//	public Map<String, Stock> getListOfStocks(String[] listOfStocknames) throws Exception;	
//	public Stock getStock(String stockname) throws IOException;
//	public StockData getStockInfo(StockString stockName)throws Exception;
//	public Map<String, Stock> getListOfStocks(String[] listOfStocknames)throws Exception;
//	public Stock getStockHistoryWeekly(String stockname,int years) throws Exception;



}


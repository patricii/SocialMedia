package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comments;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Comments c1 = new Comments("Have a Nice Trip Bud!!!");
		Comments c2 = new Comments("WoW thats awesome man!!!!");
		Post post = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zeland!!",
				"I'm going to visit this wonderful country!"
				, 7);
		post.AddComment(c1);
		post.AddComment(c2);
		System.out.println(post.toString());
		
		sc.close();

	}

}

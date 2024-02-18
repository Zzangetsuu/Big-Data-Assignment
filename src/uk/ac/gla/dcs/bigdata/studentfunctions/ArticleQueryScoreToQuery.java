package uk.ac.gla.dcs.bigdata.studentfunctions;

import org.apache.spark.api.java.function.MapFunction;

import uk.ac.gla.dcs.bigdata.providedstructures.Query;
import uk.ac.gla.dcs.bigdata.studentstructures.ArticleQueryScore;

/**
 * Returns the query from the ArticleQueryScore. 
 *
 */
public class ArticleQueryScoreToQuery implements MapFunction<ArticleQueryScore, Query> {

	private static final long serialVersionUID = 3461040687521268325L;

	@Override
	public Query call(ArticleQueryScore articleQueryScore) throws Exception {
		
		// Return the query from the ArticleQueryScore object.
		return articleQueryScore.getQuery();
	}

}

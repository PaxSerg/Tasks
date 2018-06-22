import java.util.*;
//
//import com.merakianalytics.orianna.*;
//import com.merakianalytics.orianna.types.common.Queue;
//import com.merakianalytics.orianna.types.common.Region;
//import com.merakianalytics.orianna.types.common.Season;
//import com.merakianalytics.orianna.types.core.league.League;
//import com.merakianalytics.orianna.types.core.match.Match;
//import com.merakianalytics.orianna.types.core.match.MatchHistory;
//import com.merakianalytics.orianna.types.core.match.Participant;
//import com.merakianalytics.orianna.types.core.staticdata.Champion;
//import com.merakianalytics.orianna.types.core.staticdata.Champions;
//import com.merakianalytics.orianna.types.core.summoner.Summoner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//import com.merakianalytics.orianna.types.common.Region;
//import com.merakianalytics.orianna.types.core.match.Match;
//import com.merakianalytics.orianna.types.core.match.MatchHistory;
//import com.merakianalytics.orianna.types.core.match.Participant;
//import com.merakianalytics.orianna.types.core.staticdata.Champion;
//import com.merakianalytics.orianna.types.core.staticdata.Champions;
//import com.merakianalytics.orianna.types.core.summoner.Summoner;


public class oriannaTest {

    String PERSONAL_KEY = "RGAPI-7d903f2e-a342-470b-9887-6f3ae1372ddb";
    String SUMMONER_NAME = "geei";

    public oriannaTest() {
    }

    @Before
    public void precondition() {

    }

    @After
    public void postcondition() {

    }
//
//    @Test
//    public void firstTest()   {
//        Orianna.setRiotAPIKey(PERSONAL_KEY);
//        Orianna.setDefaultRegion(Region.NORTH_AMERICA);
//
//        Summoner summoner = Orianna.summonerNamed(SUMMONER_NAME).get();
//        System.out.println(summoner.getName() + " is level " + summoner.getLevel() + " on the " + summoner.getRegion() + " server.");
//
//        Champions champions = Orianna.getChampions();
//        Champion randomChampion = champions.get((int)(Math.random() * champions.size()));
//        System.out.println("He enjoys playing champions such as " + randomChampion.getName());
//
//        League challengerLeague = Orianna.challengerLeagueInQueue(Queue.RANKED_SOLO_5x5).get();
//        Summoner bestNA = challengerLeague.get(0).getSummoner();
//        System.out.println("He's not as good as " + bestNA.getName() + " at League, but probably a better Java programmer!");
//    }
//
//
//
//    @Test
//    public void secondTest()   {
//        final Summoner summoner = Summoner.named(SUMMONER_NAME).withRegion(Region.NORTH_AMERICA).get();
//        final Region region = summoner.getRegion();
//
//        final HashSet<Long> unpulledSummonerIds = new HashSet<>();
//        unpulledSummonerIds.add(summoner.getId());
//        final HashSet<Long> pulledSummonerIds = new HashSet<>();
//
//        final HashSet<Long> unpulledMatchIds = new HashSet<>();
//        final HashSet<Long> pulledMatchIds = new HashSet<>();
//
//        while(!unpulledSummonerIds.isEmpty()) {
//            // Get a new summoner from our list of unpulled summoners and pull their match history
//            final long newSummonerId = unpulledSummonerIds.iterator().next();
//            final Summoner newSummoner = Summoner.withId(newSummonerId).withRegion(region).get();
//            final MatchHistory matches = filterMatchHistory(newSummoner);
//            for(final Match match : matches) {
//                if(!pulledMatchIds.contains(match.getId())) {
//                    unpulledMatchIds.add(match.getId());
//                }
//            }
//            unpulledSummonerIds.remove(newSummonerId);
//            pulledSummonerIds.add(newSummonerId);
//
//            while(!unpulledMatchIds.isEmpty()) {
//                // Get a random match from our list of matches
//                final long newMatchId = unpulledMatchIds.iterator().next();
//                final Match newMatch = Match.withId(newMatchId).withRegion(region).get();
//                for(final Participant p : newMatch.getParticipants()) {
//                    if(!pulledSummonerIds.contains(p.getSummoner().getId()) && !unpulledSummonerIds.contains(p.getSummoner().getId())) {
//                        unpulledSummonerIds.add(p.getSummoner().getId());
//                    }
//                }
//                // The above lines will trigger the match to load its data by iterating over all the participants.
//                // If you have a database in your datapipeline, the match will automatically be stored in it.
//                unpulledMatchIds.remove(newMatchId);
//                pulledMatchIds.add(newMatchId);
//            }
//        }
//
//    }
//
//
//        private static MatchHistory filterMatchHistory(final Summoner summoner) {
//            final MatchHistory matchHistory = MatchHistory.forSummoner(summoner).withQueues(Queue.ARAM).withSeasons(Season.SEASON_8).get();
//            return matchHistory;
//        }
//
//
//        @Test
//    public void thirdTest(){
//            Orianna.setRiotAPIKey(PERSONAL_KEY);
//            Orianna.setDefaultRegion(Region.NORTH_AMERICA);
//
//            // Notice how this object never requires a call to the summoner endpoint because we provide all the needed data!
//            final Summoner summoner = Summoner.withAccountId(36321079).withRegion(Region.NORTH_AMERICA).get(); // .withId(22508641).named("FatalElement")
//
//            // A MatchHistory is a lazy list, meaning it's elements only get loaded as-needed.
//
//            final MatchHistory matchHistory = MatchHistory.forSummoner(summoner).get();
//            // MatchHistory match_history = MatchHistory.forSummoner(summoner).withQueues([Queue.RANKED_SOLO_5x5]).withSeasons([Season.SEASON_7]).get();
//
//            // Load the entire match history by iterating over all its elements so that we know how long it is.
//            // Unfortunately since we are iterating over the match history and accessing the summoner's champion for each match,
//            // we need to know what version of the static data the champion should have. To avoid pulling many different
//            // static data versions, we will instead create a {champion_id -> champion_name} mapping and just access the champion's
//            // ID from the match data (which it provides directly).
//            final Map<Integer, String> championIdToNameMapping = new HashMap<>();
//            for(final Champion champion : Champions.withRegion(Region.NORTH_AMERICA).get()) {
//                championIdToNameMapping.put(champion.getId(), champion.getName());
//            }
//            final Map<String, Integer> playedChampions = new HashMap<>();
//            for(final Match match : matchHistory) {
//                final Integer championId = match.getParticipants().find(summoner).getChampion().getId();
//                final String championName = championIdToNameMapping.get(championId);
//                Integer count = playedChampions.get(championName);
//                if(count == null) {
//                    count = 0;
//                    playedChampions.put(championName, count);
//                }
//                playedChampions.put(championName, playedChampions.get(championName) + 1);
//            }
//            System.out.println("Length of match history: " + matchHistory.size());
//
//            // Print the top ten aggregated champion results
//            final List<Entry<String, Integer>> entries = new ArrayList<>(playedChampions.entrySet());
//            entries.sort((final Entry<String, Integer> e0, final Entry<String, Integer> e1) -> Integer.compare(e1.getValue(), e0.getValue()));
//
//            for(int i = 0; i < 10 && i < entries.size(); i++) {
//                final String championName = entries.get(i).getKey();
//                final int count = entries.get(i).getValue();
//                System.out.println(championName + " " + count);
//            }
//
//            System.out.println("\n");
//
//            final Match match = matchHistory.get(0);
//            System.out.println("Match ID: " + match.getId());
//
//            final Participant participant = match.getParticipants().find(summoner);
//            System.out.println("\nSince the match was created from a matchref, we only know one participant:");
//            System.out.println(participant.getSummoner().getName() + " played " + participant.getChampion().getName());
//
//            System.out.println("\nNow pull the full match data by iterating over all the participants:");
//            for(final Participant p : match.getParticipants()) {
//                System.out.println(p.getSummoner().getName() + " played " + p.getChampion().getName());
//            }
//
//            System.out.println("\nIterate over all the participants again and note that the data is not repulled:");
//            for(final Participant p : match.getParticipants()) {
//                System.out.println(p.getSummoner().getName() + " played " + p.getChampion().getName());
//            }
//
//            System.out.println("\nBlue team won? " + match.getBlueTeam().isWinner());
//            System.out.println("Red team won? " + match.getRedTeam().isWinner());
//            System.out.println("Participants on blue team:");
//            for(final Participant p : match.getBlueTeam().getParticipants()) {
//                System.out.println(p.getSummoner().getName());
//            }
//        }
}

/*
http://new.galalaly.me/2011/05/tagging-text-with-stanford-pos-tagger-in-java-applications/

https://www.programcreek.com/java-api-examples/index.php?source_dir=CoreNLP-master/src/edu/stanford/nlp/trees/UniversalEnglishGrammaticalRelations.java
*/
import java.util.Collection;

import edu.stanford.nlp.ling.Sentence;
import edu.stanford.nlp.parser.lexparser.LexicalizedParser;
import edu.stanford.nlp.trees.GrammaticalStructure;
import edu.stanford.nlp.trees.GrammaticalStructureFactory;
import edu.stanford.nlp.trees.PennTreebankLanguagePack;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.trees.TreebankLanguagePack;
import edu.stanford.nlp.trees.TypedDependency;

public class TagText {

	public static void main(String[] args) throws Exception {
		/*// Initialize the tagger
        MaxentTagger tagger = new MaxentTagger(
                "D://left3words-wsj-0-18.tagger");
 
        // The sample string
        String sample = "This is a sample text";
 
        // The tagged string
        String tagged = tagger.tagString(sample);
 
        // Output the result
        System.out.println(tagged);*/
		
		/*
		 try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}  
            
		 */
		
		/*FileInputStream fin=null;
		 try{    
	             fin=new FileInputStream("taggers/left3words-wsj-0-18.tagger");    
	            int i=fin.read();  
	            System.out.print((char)i);    
	  
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}  
		
		*/
		 /*try{    
             FileOutputStream fout=new FileOutputStream("taggers/testout.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}   */  
		 
		/* MaxentTagger tagger = new MaxentTagger("taggers/left3words-wsj-0-18.tagger");
	 
	        // The sample string
	        String sample = "This is a sample text";
	 
	        // The tagged string
	        String tagged = tagger.tagString(sample);
	 
	        // Output the result
	        System.out.println(tagged);*/
		
		
		LexicalizedParser lp = LexicalizedParser.loadModel(
                "D:\\englishPCFG.ser.gz",
                "-maxLength", "80", "-retainTmpSubcategories");
        TreebankLanguagePack tlp = new PennTreebankLanguagePack();
       // tlp.setGenerateOriginalDependencies(true);
        GrammaticalStructureFactory gsf = tlp.grammaticalStructureFactory();

        //String[] sent = { "This", "is", "an", "easy", "sentence", "." };
        String s = "where is laibraries rob";
        String[] arr = s.split(" ");
       
        Tree parse = lp.apply(Sentence.toWordList(arr));
        GrammaticalStructure gs = gsf.newGrammaticalStructure(parse);
                            
      /*  Collection<TypedDependency> tdl = gs.typedDependenciesCCprocessed();*/
        Collection<TypedDependency> tdl = gs.typedDependenciesCollapsed(); 
        Collection<TypedDependency> td2 = gs.typedDependenciesCCprocessed();
       
        Collection<TypedDependency> td3 = gs.allTypedDependencies(); 
        System.out.println(tdl);
        System.out.println(td2);
        System.out.println(td3);
	         }   
	}


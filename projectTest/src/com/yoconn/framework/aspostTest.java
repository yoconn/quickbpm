package com.yoconn.framework;

import junit.framework.TestCase;
import com.aspose.words.*;
public class aspostTest     extends TestCase{
  public  void testTest()
  {
	  //����git�ύ
		try {
			Document doc1 = new Document("E:\\tmp\\1.doc");
			Document doc2 = new Document("E:\\tmp\\2.doc");
			 
			//yuy test
			//yuy test
 
			//yuy 123
			//yuy 456
 //222
			//ccmtest
			//ccmttt22
<<<<<<< HEAD
 //github.com/yoconn/quickbpm.git
=======
			//ccmtest4
>>>>>>> branch 'master' of https://github.com/yoconn/quickbpm.git
			  DocumentBuilder builder2 = new DocumentBuilder(doc2);
			  builder2.moveToMergeField("DOC_ADVICE_COMPANY"); 
		 
              Node insertAfterNode = builder2.getCurrentParagraph().getPreviousSibling();


for(int i=0;i<doc1.getSections().getCount();i++)
{
	System.out.println("getSections:"+doc1.getSections().getCount());
	com.aspose.words.Section	srcSection =doc1.getSections().get(i);
	int nodeCount =srcSection.getBody().getChildNodes().getCount();
	System.out.println("nodeCount:"+srcSection.getBody().getChildNodes().getCount());
    for(int nodeIndex=0; nodeIndex<nodeCount; nodeIndex++)
    {
        Node srcNode = srcSection.getBody().getChildNodes().get(nodeIndex);
        System.out.println(srcNode.getText());
       // srcSection.get
        Node newNode = doc2.importNode(srcNode, true);
       // insertAfterNode.getParentNode().insertAfter(newNode, insertAfterNode);
        insertAfterNode.getParentNode().insertAfter(newNode, insertAfterNode);
      //  insertAfterNode.
        insertAfterNode=newNode;
        
    }


	//doc1.getSections().get(i).getBody()
}
		// com.aspose.words.NodeImporter ni=new com.aspose.words.NodeImporter( doc2.getDocument(),doc1.getDocument(), 0);
		// ni.importNode(srcNode, isImportChildren)
			 // int i=doc1.getChildNodes().getCount();
		//	 Node n= doc2.importNode(doc1.getDocument(), true);
			//  doc2.appendDocument(doc1, 0);
			 // doc2.importNode(doc1, true);
			  //doc2.getMailMerge().
//			  for (int k=0;k<i;k++ )
//			  {
//			     builder2.insertNode(doc1.getChildNodes().get(k) ) ;
//			  doc2.importNode(doc1, true)
//			     doc2.appendDocument(srcDoc, importFormatMode)
//			  }
			//  do
			  
			  doc2.save("E:\\tmp\\3.doc");
			 // builder2.writeln();
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
  }
}

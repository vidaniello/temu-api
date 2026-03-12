sulla base di questo oggetto come esempio per effettuare richieste:

Contenuto del file '/temu-api/src/main/java/com/github/vidaniello/temuapi/requestresultobjects/BgLocalMallInfoGetRequest.java':
```
1: package com.github.vidaniello.temuapi.requestresultobjects;
2: 
3: import java.util.ArrayList;
4: import java.util.List;
5: 
6: /**
7:  * Request object for the API call 'bg.local.mall.info.get'.
8:  * Used to retrieve mall IDs and site information.
9:  */
10: public class BgLocalMallInfoGetRequest implements TemuRequestIf {
11: 
12: 	private static final long serialVersionUID = 1L;
13: 	
14: 	/**
15: 	 * Associated mall ID.
16: 	 * Required for Query;
17: 	 * Optional – if provided, it will only return mall IDs and site information 
18: 	 * for malls under the same entity as the current mall, within the range of 
19: 	 * the specified branchesMallId.
20: 	 */
21: 	private List<Long> branchesMallId;
22: 		
23: 	public BgLocalMallInfoGetRequest() {
24: 		this.branchesMallId = new ArrayList<>();
25: 	}
26: 	
27: 	/**
28: 	 * @return the list of associated mall IDs
29: 	 */
30: 	public List<Long> getBranchesMallId() {
31: 		return branchesMallId;
32: 	}
33: 	
34: 	/**
35: 	 * @param branchesMallId the list of associated mall IDs
36: 	 * @return this request object for method chaining
37: 	 */
38: 	public BgLocalMallInfoGetRequest setBranchesMallId(List<Long> branchesMallId) {
39: 		this.branchesMallId = branchesMallId;
40: 		return this;
41: 	}
42: }
```
crea quest'altro oggetto di richiesta per la chiamata api 'temu.local.goods.delete':

```
goodsId
LONG	True	goodsId
```

Usa List per gli array ed includi la documentazione e se hai bisogno di creare altre classi, fai InnerClass.






















mi fai anche la risposta? di seguito i campi necessari (fai estendere l'interfaccia TemuResponseIf):

```
success
BOOLEAN	delete result
errorMsg
STRING	error message
```









Perfetto! Mi fai adesso quest'altro oggetto di richiesta alla chiamata 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'?

```
...
```

mi fai anche la risposta? di seguito i campi necessari:

```
...
```























Sullo stile di questi oggetti che rappresentano la richiesta e la risposta ad una chiamata api:

Contenuto del file '/temu-api/src/main/java/com/github/vidaniello/temuapi/requestresultobjects/BgLocalGoodsCatsGetRequest.java':
```
1: package com.github.vidaniello.temuapi.requestresultobjects;
2: 
3: /**
4:  * Request object for the API call 'bg.local.goods.cats.get'.
5:  * Used to retrieve goods categories.
6:  */
7: public class BgLocalGoodsCatsGetRequest implements TemuRequestIf {
8: 
9: 	private static final long serialVersionUID = 1L;
10: 	
11: 	/**
12: 	 * Language for the category names.
13: 	 */
14: 	private String language;
15: 	
16: 	/**
17: 	 * Parent Category ID: if not provided, all primary categories will be queried.
18: 	 * This field is required.
19: 	 */
20: 	private Long parentCatId;
21: 		
22: 	public BgLocalGoodsCatsGetRequest() {
23: 	}
24: 	
25: 	/**
26: 	 * @return the language for category names
27: 	 */
28: 	public String getLanguage() {
29: 		return language;
30: 	}
31: 	
32: 	/**
33: 	 * @param language the language for category names
34: 	 * @return this request object for method chaining
35: 	 */
36: 	public BgLocalGoodsCatsGetRequest setLanguage(String language) {
37: 		this.language = language;
38: 		return this;
39: 	}
40: 	
41: 	/**
42: 	 * @return the parent Category ID
43: 	 */
44: 	public Long getParentCatId() {
45: 		return parentCatId;
46: 	}
47: 	
48: 	/**
49: 	 * @param parentCatId the parent Category ID
50: 	 * @return this request object for method chaining
51: 	 */
52: 	public BgLocalGoodsCatsGetRequest setParentCatId(Long parentCatId) {
53: 		this.parentCatId = parentCatId;
54: 		return this;
55: 	}
56: }
```
Contenuto del file '/temu-api/src/main/java/com/github/vidaniello/temuapi/requestresultobjects/BgLocalGoodsCatsGetResponse.java':
```
1: package com.github.vidaniello.temuapi.requestresultobjects;
2: 
3: import java.util.ArrayList;
4: import java.util.List;
5: 
6: /**
7:  * Response object for the API call 'bg.local.goods.cats.get'.
8:  * Contains the list of goods categories.
9:  */
10: public class BgLocalGoodsCatsGetResponse implements TemuResponseIf {
11: 
12: 	private static final long serialVersionUID = 1L;
13: 	
14: 	/**
15: 	 * Category information list.
16: 	 */
17: 	private List<GoodsCats> goodsCatsList;
18: 		
19: 	public BgLocalGoodsCatsGetResponse() {
20: 		this.goodsCatsList = new ArrayList<>();
21: 	}
22: 	
23: 	/**
24: 	 * @return the category information list
25: 	 */
26: 	public List<GoodsCats> getGoodsCatsList() {
27: 		return goodsCatsList;
28: 	}
29: 	
30: 	/**
31: 	 * @param goodsCatsList the category information list
32: 	 * @return this response object for method chaining
33: 	 */
34: 	public BgLocalGoodsCatsGetResponse setGoodsCatsList(List<GoodsCats> goodsCatsList) {
35: 		this.goodsCatsList = goodsCatsList;
36: 		return this;
37: 	}
38: 	
39: 	/**
40: 	 * Inner class representing category information.
41: 	 */
42: 	public static class GoodsCats implements java.io.Serializable {
43: 		
44: 		private static final long serialVersionUID = 1L;
45: 		
46: 		/**
47: 		 * Category ID.
48: 		 */
49: 		private Long catId;
50: 		
51: 		/**
52: 		 * Category Name.
53: 		 */
54: 		private String catName;
55: 		
56: 		/**
57: 		 * Category Level: 
58: 		 * 1 - Primary Category, 
59: 		 * 2 - Secondary Category, 
60: 		 * 3 - Tertiary Category, 
61: 		 * 4 - Quaternary Category.
62: 		 */
63: 		private Integer level;
64: 		
65: 		/**
66: 		 * Parent Category ID: The ID of the parent category.
67: 		 * parent_id=0 indicates a top-level node.
68: 		 */
69: 		private Long parentId;
70: 		
71: 		/**
72: 		 * Is Leaf Category.
73: 		 */
74: 		private Boolean leaf;
75: 		
76: 		/**
77: 		 * Category Type: 
78: 		 * 0 - Apparel, 
79: 		 * 1 - Other.
80: 		 */
81: 		private Integer catType;
82: 		
83: 		/**
84: 		 * Category status: 
85: 		 * 0 - Available, 
86: 		 * 1 - Not available.
87: 		 */
88: 		private Integer availableStatus;
89: 		
90: 		/**
91: 		 * Expand category type: 
92: 		 * 0 - Apparel, 
93: 		 * 1 - Others, 
94: 		 * 2 - Books, 
95: 		 * 3 - DVD, 
96: 		 * 4 - CD, 
97: 		 * 5 - Seed.
98: 		 */
99: 		private Integer expandCatType;
100: 		
101: 		/**
102: 		 * Whether second hand category.
103: 		 */
104: 		private Boolean secondHandCategory;
105: 			
106: 		public GoodsCats() {
107: 		}
108: 		
109: 		/**
110: 		 * @return the category ID
111: 		 */
112: 		public Long getCatId() {
113: 			return catId;
114: 		}
115: 		
116: 		/**
117: 		 * @param catId the category ID
118: 		 * @return this object for method chaining
119: 		 */
120: 		public GoodsCats setCatId(Long catId) {
121: 			this.catId = catId;
122: 			return this;
123: 		}
124: 		
125: 		/**
126: 		 * @return the category name
127: 		 */
128: 		public String getCatName() {
129: 			return catName;
130: 		}
131: 		
132: 		/**
133: 		 * @param catName the category name
134: 		 * @return this object for method chaining
135: 		 */
136: 		public GoodsCats setCatName(String catName) {
137: 			this.catName = catName;
138: 			return this;
139: 		}
140: 		
141: 		/**
142: 		 * @return the category level
143: 		 */
144: 		public Integer getLevel() {
145: 			return level;
146: 		}
147: 		
148: 		/**
149: 		 * @param level the category level
150: 		 * @return this object for method chaining
151: 		 */
152: 		public GoodsCats setLevel(Integer level) {
153: 			this.level = level;
154: 			return this;
155: 		}
156: 		
157: 		/**
158: 		 * @return the parent category ID
159: 		 */
160: 		public Long getParentId() {
161: 			return parentId;
162: 		}
163: 		
164: 		/**
165: 		 * @param parentId the parent category ID
166: 		 * @return this object for method chaining
167: 		 */
168: 		public GoodsCats setParentId(Long parentId) {
169: 			this.parentId = parentId;
170: 			return this;
171: 		}
172: 		
173: 		/**
174: 		 * @return true if leaf category, false otherwise
175: 		 */
176: 		public Boolean getLeaf() {
177: 			return leaf;
178: 		}
179: 		
180: 		/**
181: 		 * @param leaf whether it is a leaf category
182: 		 * @return this object for method chaining
183: 		 */
184: 		public GoodsCats setLeaf(Boolean leaf) {
185: 			this.leaf = leaf;
186: 			return this;
187: 		}
188: 		
189: 		/**
190: 		 * @return the category type
191: 		 */
192: 		public Integer getCatType() {
193: 			return catType;
194: 		}
195: 		
196: 		/**
197: 		 * @param catType the category type
198: 		 * @return this object for method chaining
199: 		 */
200: 		public GoodsCats setCatType(Integer catType) {
201: 			this.catType = catType;
202: 			return this;
203: 		}
204: 		
205: 		/**
206: 		 * @return the category available status
207: 		 */
208: 		public Integer getAvailableStatus() {
209: 			return availableStatus;
210: 		}
211: 		
212: 		/**
213: 		 * @param availableStatus the category status
214: 		 * @return this object for method chaining
215: 		 */
216: 		public GoodsCats setAvailableStatus(Integer availableStatus) {
217: 			this.availableStatus = availableStatus;
218: 			return this;
219: 		}
220: 		
221: 		/**
222: 		 * @return the expand category type
223: 		 */
224: 		public Integer getExpandCatType() {
225: 			return expandCatType;
226: 		}
227: 		
228: 		/**
229: 		 * @param expandCatType the expand category type
230: 		 * @return this object for method chaining
231: 		 */
232: 		public GoodsCats setExpandCatType(Integer expandCatType) {
233: 			this.expandCatType = expandCatType;
234: 			return this;
235: 		}
236: 		
237: 		/**
238: 		 * @return true if second hand category, false otherwise
239: 		 */
240: 		public Boolean getSecondHandCategory() {
241: 			return secondHandCategory;
242: 		}
243: 		
244: 		/**
245: 		 * @param secondHandCategory whether it is a second hand category
246: 		 * @return this object for method chaining
247: 		 */
248: 		public GoodsCats setSecondHandCategory(Boolean secondHandCategory) {
249: 			this.secondHandCategory = secondHandCategory;
250: 			return this;
251: 		}
252: 	}
253: }
```

mi generi l'oggetto per la request alla chiamata api '':

Struttura json d'esempio:

```
{
   
}
```

Documentazione:

```

```



Questo invece è l'oggetto response:

Struttura json d'esempio:


```
{

}
```

Documentazione:

```

```
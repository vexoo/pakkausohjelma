Tietojenkäsittelytieteen kandidaatti, projektin dokumentaatio suomeksi.

Heitin noppaa ja noppa päätti, että teen tiedon tiivistykseen liittyvän ohjelman. Tarkoituksena on toteuttaa LZW-algoritmi Javalla sekä ajan ja mielenkiinnon salliessa lisätä ohjelmaan joku muu tiivistysalgoritmi myöhemmin, varmaan Huffman.

LZW-algoritmissa tarkoitukseni on tallentaa tiivistykseen käytettävä sanasto HashMappiin ja tiivistetyt arvot ArrayListiin, molemmat toteutettu lopulta itse kurssin vaatimuksen mukaisesti. Toteutuksen aikavaativuuden tavoite on O(n), sillä tiivistyksessä jokainen tavu luetaan kerran ja jokaiselle merkille suoritettavan operaation aikavaativuus on vakio.
Tavoite on, että ohjelma saa syötteenä tiedoston (tiedoston tyyppi tbd) ja palauttaa pienemmän kokoisen kopion siitä. Myös päinvastainen toimii.

Lähteet:
</br>[Wikipedia - Lempel-Ziv-Welch](https://en.wikipedia.org/wiki/Lempel%E2%80%93Ziv%E2%80%93Welch)
</br>[marknelson.us - LZW Data Compression Revisited](https://marknelson.us/posts/2011/11/08/lzw-revisited.html)

#!/bin/sh

#mongoimport -v --uri "mongodb://localhost:27017/geodata" --file /Users/rasse/Downloads/SE/SE.txt -c "city" --fieldFile=/Users/rasse/Downloads/SE/fields.txt --type=tsv

cd tmp

for i in `ls -1 /Users/rasse/Downloads/??.zip`
do
echo ${i}
unzip ${i}
mongoimport -v --uri "mongodb://localhost:27017/geodata" --file ??.txt -c "city" --fieldFile=../fields.txt --type=tsv
rm -f ??.txt
rm -f readme.txt
done

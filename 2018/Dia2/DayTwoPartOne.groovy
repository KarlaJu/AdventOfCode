String boxIds = new File('boxIds.txt').text
//String boxIds = "apodns\npdpqpd"
Integer sumNumberTwo = 0
Integer sumNumberThree = 0
boxIds.eachLine{ id ->
    Integer findNumberTwo = 0
    Integer findNumberThree = 0   
    id.each{ character ->
      id.findAll(character).size() == 2 ? findNumberTwo++ : 0
      id.findAll(character).size() == 3 ? findNumberThree++ : 0
    }
    findNumberTwo > 0 ? sumNumberTwo++ : 0
    findNumberThree > 0 ? sumNumberThree++ : 0
}
Integer checksum = sumNumberTwo * sumNumberThree
println "Total two: ${sumNumberTwo}"
println "Total three: ${sumNumberThree}"
println "Checksum: ${checksum}"
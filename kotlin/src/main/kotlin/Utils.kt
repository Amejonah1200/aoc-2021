import java.math.BigInteger
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readLines

class Dummy

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = Path.of("./inputs/$name.txt").readLines()

/**
 * Converts string to md5 hash.
 */
fun String.md5(): String = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray())).toString(16)

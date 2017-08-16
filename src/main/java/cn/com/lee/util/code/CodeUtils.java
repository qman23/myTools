package cn.com.lee.util.code;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

import cn.com.lee.util.string.StringUtil;

/**
 * This class is used for encode/decode for string
 * @author lee
 *
 */
public class CodeUtils {
	/**
	 * encrypt string using Secure Hash Algorithm 256
	 * @param msg
	 * @return
	 */
	public static String encryptSHA256(String msg){
		MessageDigest sha256 = DigestUtils.getSha256Digest();
		return encryptByGivenModel(sha256,msg);
	}
	
	/**
	 * encrypt string using Secure Hash Algorithm1
	 * @param msg
	 * @return
	 */
	public static String encryptSHA1(String msg){
		MessageDigest sha1 = DigestUtils.getSha1Digest();
		return encryptByGivenModel(sha1, msg);
	}
	/**
	 * encrypt string using given messageDigest
	 * @param md
	 * @param msg
	 * @return
	 */
	private static String encryptByGivenModel(MessageDigest md, String msg){
		if(StringUtil.isEmpty(msg))return "";
		byte[] byteArr = md.digest(msg.getBytes());
		return Hex.encodeHexString(byteArr);
	}
	
	/**
	 * encode string to base64(decodeable)
	 * @param msg
	 * @return
	 */
	private static String encodeBase64(String msg){
		if(StringUtil.isEmpty(msg))return "";
		return Base64.encodeBase64String(msg.getBytes());
		
	}
	
	/**
	 * decode base64 encode string
	 * @param encodeStr
	 * @return
	 */
	private static String decodeBase64(String encodeStr){
		if(StringUtil.isEmpty(encodeStr))return "";
		return new String(Base64.decodeBase64(encodeStr));
	}
	
	
	public static void main(String[] args) {
		String str = "test";
		System.out.println(encryptSHA256(str));
		System.out.println(encryptSHA1(str).length());
		
		String encode = encodeBase64(str);
		System.out.println(encode);
		System.out.println(decodeBase64(encode));
	}
}

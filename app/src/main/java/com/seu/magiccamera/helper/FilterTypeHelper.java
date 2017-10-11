package com.seu.magiccamera.helper;

import com.seu.magiccamera.R;
import com.seu.magicfilter.filter.helper.MagicFilterType;
import  java.util.*;


/**
 * FilterTypeHelper Class, to manage the filters
 */
public class FilterTypeHelper {

	public static int FilterType2Color(MagicFilterType filterType){
		HashMap<MagicFilterType, Integer> filterTypeMap = new HashMap<>();
		filterTypeMap.put(MagicFilterType.NONE, R.color.filter_color_grey_light);
		filterTypeMap.put(MagicFilterType.WHITECAT, R.color.filter_color_brown_light);
		filterTypeMap.put(MagicFilterType.BLACKCAT, R.color.filter_color_brown_light);
		filterTypeMap.put(MagicFilterType.SUNRISE, R.color.filter_color_brown_light);
		filterTypeMap.put(MagicFilterType.SUNSET, R.color.filter_color_brown_light);
		filterTypeMap.put(MagicFilterType.COOL, R.color.filter_color_blue_dark);
		filterTypeMap.put(MagicFilterType.EMERALD, R.color.filter_color_blue_dark_dark);
		filterTypeMap.put(MagicFilterType.EVERGREEN, R.color.filter_color_blue_dark_dark);
		filterTypeMap.put(MagicFilterType.FAIRYTALE, R.color.filter_color_blue);
		filterTypeMap.put(MagicFilterType.ROMANCE, R.color.filter_color_pink);
		filterTypeMap.put(MagicFilterType.SAKURA, R.color.filter_color_pink);
		filterTypeMap.put(MagicFilterType.WARM, R.color.filter_color_pink);
		filterTypeMap.put(MagicFilterType.AMARO, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.BRANNAN, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.BROOKLYN, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.EARLYBIRD, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.FREUD, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.HEFE, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.HUDSON, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.INKWELL, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.KEVIN, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.LOMO, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.N1977, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.NASHVILLE, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.PIXAR, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.RISE, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.SIERRA, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.SUTRO, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.TOASTER2, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.VALENCIA, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.WALDEN, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.XPROII, R.color.filter_color_brown_dark);
		filterTypeMap.put(MagicFilterType.ANTIQUE, R.color.filter_color_green_dark);
		filterTypeMap.put(MagicFilterType.NOSTALGIA, R.color.filter_color_green_dark);
		filterTypeMap.put(MagicFilterType.SKINWHITEN, R.color.filter_color_red);
		filterTypeMap.put(MagicFilterType.HEALTHY, R.color.filter_color_red);
		filterTypeMap.put(MagicFilterType.SWEETS, R.color.filter_color_red_dark);
		filterTypeMap.put(MagicFilterType.SWEETS, R.color.filter_color_red_dark);
		filterTypeMap.put(MagicFilterType.CALM, R.color.filter_color_brown);
		filterTypeMap.put(MagicFilterType.LATTE, R.color.filter_color_brown);
		filterTypeMap.put(MagicFilterType.TENDER, R.color.filter_color_brown);

		if (filterTypeMap.containsKey(filterType)){
			return filterTypeMap.get(filterType);
		} else {
			return R.color.filter_color_grey_light;
		}
	}

	public static int FilterType2Thumb(MagicFilterType filterType){
		Map<MagicFilterType, Integer> filterTypeMap = new HashMap<>();
		filterTypeMap.put(MagicFilterType.NONE, R.drawable.filter_thumb_original);
		filterTypeMap.put(MagicFilterType.WHITECAT, R.drawable.filter_thumb_whitecat);
		filterTypeMap.put(MagicFilterType.BLACKCAT, R.drawable.filter_thumb_blackcat);
		filterTypeMap.put(MagicFilterType.ROMANCE, R.drawable.filter_thumb_romance);
		filterTypeMap.put(MagicFilterType.SAKURA, R.drawable.filter_thumb_sakura);
		filterTypeMap.put(MagicFilterType.AMARO, R.drawable.filter_thumb_amoro);
		filterTypeMap.put(MagicFilterType.BRANNAN, R.drawable.filter_thumb_brannan);
		filterTypeMap.put(MagicFilterType.BROOKLYN, R.drawable.filter_thumb_brooklyn);
		filterTypeMap.put(MagicFilterType.EARLYBIRD, R.drawable.filter_thumb_earlybird);
		filterTypeMap.put(MagicFilterType.FREUD, R.drawable.filter_thumb_freud);
		filterTypeMap.put(MagicFilterType.HEFE, R.drawable.filter_thumb_hefe);
		filterTypeMap.put(MagicFilterType.HUDSON, R.drawable.filter_thumb_hudson);
		filterTypeMap.put(MagicFilterType.INKWELL, R.drawable.filter_thumb_inkwell);
		filterTypeMap.put(MagicFilterType.KEVIN, R.drawable.filter_thumb_kevin);
		filterTypeMap.put(MagicFilterType.LOMO, R.drawable.filter_thumb_lomo);
		filterTypeMap.put(MagicFilterType.N1977, R.drawable.filter_thumb_1977);
		filterTypeMap.put(MagicFilterType.NASHVILLE, R.drawable.filter_thumb_nashville);
		filterTypeMap.put(MagicFilterType.PIXAR, R.drawable.filter_thumb_piaxr);
		filterTypeMap.put(MagicFilterType.RISE, R.drawable.filter_thumb_rise);
		filterTypeMap.put(MagicFilterType.SIERRA, R.drawable.filter_thumb_sierra);
		filterTypeMap.put(MagicFilterType.SUTRO, R.drawable.filter_thumb_sutro);
		filterTypeMap.put(MagicFilterType.TOASTER2, R.drawable.filter_thumb_toastero);
		filterTypeMap.put(MagicFilterType.VALENCIA, R.drawable.filter_thumb_valencia);
		filterTypeMap.put(MagicFilterType.WALDEN, R.drawable.filter_thumb_walden);
		filterTypeMap.put(MagicFilterType.XPROII, R.drawable.filter_thumb_xpro);
		filterTypeMap.put(MagicFilterType.ANTIQUE, R.drawable.filter_thumb_antique);
		filterTypeMap.put(MagicFilterType.SKINWHITEN, R.drawable.filter_thumb_beauty);
		filterTypeMap.put(MagicFilterType.CALM, R.drawable.filter_thumb_calm);
		filterTypeMap.put(MagicFilterType.COOL, R.drawable.filter_thumb_cool);
		filterTypeMap.put(MagicFilterType.EMERALD, R.drawable.filter_thumb_emerald);
		filterTypeMap.put(MagicFilterType.EVERGREEN, R.drawable.filter_thumb_evergreen);
		filterTypeMap.put(MagicFilterType.FAIRYTALE, R.drawable.filter_thumb_fairytale);
		filterTypeMap.put(MagicFilterType.HEALTHY, R.drawable.filter_thumb_healthy);
		filterTypeMap.put(MagicFilterType.NOSTALGIA, R.drawable.filter_thumb_nostalgia);
		filterTypeMap.put(MagicFilterType.TENDER, R.drawable.filter_thumb_tender);
		filterTypeMap.put(MagicFilterType.SWEETS, R.drawable.filter_thumb_sweets);
		filterTypeMap.put(MagicFilterType.LATTE, R.drawable.filter_thumb_latte);
		filterTypeMap.put(MagicFilterType.WARM, R.drawable.filter_thumb_warm);
		filterTypeMap.put(MagicFilterType.SUNRISE, R.drawable.filter_thumb_sunrise);
		filterTypeMap.put(MagicFilterType.SUNSET, R.drawable.filter_thumb_sunset);
		filterTypeMap.put(MagicFilterType.CRAYON, R.drawable.filter_thumb_crayon);
		filterTypeMap.put(MagicFilterType.SKETCH, R.drawable.filter_thumb_sketch);

		if (filterTypeMap.containsKey(filterType)) {
			return filterTypeMap.get(filterType);
		} else {
			return R.drawable.filter_thumb_original;
		}
	}

	public static int FilterType2Name(MagicFilterType filterType){
		Map<MagicFilterType, Integer> filterTypeMap = new HashMap<>();
		filterTypeMap.put(MagicFilterType.NONE, R.string.filter_none);
		filterTypeMap.put(MagicFilterType.WHITECAT, R.string.filter_whitecat);
		filterTypeMap.put(MagicFilterType.BLACKCAT, R.string.filter_blackcat);
		filterTypeMap.put(MagicFilterType.ROMANCE, R.string.filter_romance);
		filterTypeMap.put(MagicFilterType.SAKURA, R.string.filter_sakura);
		filterTypeMap.put(MagicFilterType.AMARO, R.string.filter_amaro);
		filterTypeMap.put(MagicFilterType.BRANNAN, R.string.filter_brannan);
		filterTypeMap.put(MagicFilterType.BROOKLYN, R.string.filter_brooklyn);
		filterTypeMap.put(MagicFilterType.EARLYBIRD, R.string.filter_Earlybird);
		filterTypeMap.put(MagicFilterType.FREUD, R.string.filter_freud);
		filterTypeMap.put(MagicFilterType.HEFE, R.string.filter_hefe);
		filterTypeMap.put(MagicFilterType.HUDSON, R.string.filter_hudson);
		filterTypeMap.put(MagicFilterType.INKWELL, R.string.filter_inkwell);
		filterTypeMap.put(MagicFilterType.KEVIN, R.string.filter_kevin);
		filterTypeMap.put(MagicFilterType.LOMO, R.string.filter_lomo);
		filterTypeMap.put(MagicFilterType.N1977, R.string.filter_n1977);
		filterTypeMap.put(MagicFilterType.NASHVILLE, R.string.filter_nashville);
		filterTypeMap.put(MagicFilterType.PIXAR, R.string.filter_pixar);
		filterTypeMap.put(MagicFilterType.RISE, R.string.filter_rise);
		filterTypeMap.put(MagicFilterType.SIERRA, R.string.filter_sierra);
		filterTypeMap.put(MagicFilterType.SUTRO, R.string.filter_sutro);
		filterTypeMap.put(MagicFilterType.TOASTER2, R.string.filter_toastero);
		filterTypeMap.put(MagicFilterType.VALENCIA, R.string.filter_valencia);
		filterTypeMap.put(MagicFilterType.WALDEN, R.string.filter_walden);
		filterTypeMap.put(MagicFilterType.XPROII, R.string.filter_xproii);
		filterTypeMap.put(MagicFilterType.ANTIQUE, R.string.filter_antique);
		filterTypeMap.put(MagicFilterType.CALM, R.string.filter_calm);
		filterTypeMap.put(MagicFilterType.COOL, R.string.filter_cool);
		filterTypeMap.put(MagicFilterType.EMERALD, R.string.filter_emerald);
		filterTypeMap.put(MagicFilterType.EVERGREEN, R.string.filter_evergreen);
		filterTypeMap.put(MagicFilterType.FAIRYTALE, R.string.filter_fairytale);
		filterTypeMap.put(MagicFilterType.HEALTHY, R.string.filter_healthy);
		filterTypeMap.put(MagicFilterType.NOSTALGIA, R.string.filter_nostalgia);
		filterTypeMap.put(MagicFilterType.TENDER, R.string.filter_tender);
		filterTypeMap.put(MagicFilterType.SWEETS, R.string.filter_sweets);
		filterTypeMap.put(MagicFilterType.LATTE, R.string.filter_latte);
		filterTypeMap.put(MagicFilterType.WARM, R.string.filter_warm);
		filterTypeMap.put(MagicFilterType.SUNRISE, R.string.filter_sunrise);
		filterTypeMap.put(MagicFilterType.SUNSET, R.string.filter_sunset);
		filterTypeMap.put(MagicFilterType.SKINWHITEN, R.string.filter_skinwhiten);
		filterTypeMap.put(MagicFilterType.CRAYON, R.string.filter_crayon);
		filterTypeMap.put(MagicFilterType.SKETCH, R.string.filter_sketch);

		if (filterTypeMap.containsKey(filterType)) {
			return filterTypeMap.get(filterType);
		} else {
			return R.drawable.filter_thumb_original;
		}
	}
}
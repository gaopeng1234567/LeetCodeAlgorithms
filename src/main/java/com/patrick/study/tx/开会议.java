package com.patrick.study.tx;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ｜                 ,;,,;;
 * ｜               ,;;'()     风
 * ｜     __      ,;;' ' \     流
 * ｜  /'  '\'~~'~' \ /'\.)    堪
 * ｜ ,;(      )    /  |.      比
 * ｜,;' \    /-.,,(   ) \     丶
 * ｜    ) /       ) / )|      城
 * ｜    ||        ||  \)      管
 * ｜   (_\       (_\          希
 * @author: 城管丶希
 * @date: Created in 2021/4/20 11:40 上午
 * @desc: 某天早上公司领导找你解决一个问题，明天公司有N个同等级的会议需要使用同一个会议室，现在给你这个N个会议的开始和结束
 * 时间，你怎么样安排才能使会议室最大利用？即安排最多场次的会议？
 * @motto: Keep It Simple and Stupid, KISS
 */
public class 开会议 {
	@Data
	@AllArgsConstructor
	static
	class Meeting implements Comparable<Meeting> {
		/**
		 * 编号
		 */
		private int num;
		/**
		 * 会议开始时间
		 */
		private int startTime;
		/**
		 * 会议结束时间
		 */
		private int endTime;

		@Override
		public int compareTo(Meeting o) {
			if (this.endTime > o.getEndTime()) {
				return 1;
			}
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<Meeting> meetings = new ArrayList<>();//所有会议集合
		int n = cin.nextInt(); //输入会议场数字
		for (int i = 1; i <= n; i++) {
			int start = cin.nextInt();//开始时间
			int end = cin.nextInt();///结束时间
			Meeting meeting = new Meeting(i, start, end);
			meetings.add(meeting);
		}
		meetings.sort(null);//已经实现了排序，即可传入null即可
		int curr = 0; //会议从几点开始， 如果是八点则修改为8
		for (Meeting meeting : meetings) {
			if (meeting.getStartTime() >= curr) {
				System.out.println(meeting.toString());
				curr = meeting.getEndTime();
			}
		}
	}
}
